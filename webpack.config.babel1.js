//webpack config for babel

import path from 'path';
import webpack from 'webpack';

const env = process.env;
const version = env.npm_package_version;
const buildPath = env.npm_package_config_appWebpackBuildPath;
const baseUrl = env.npm_package_config_appWebpackBaseUrl;

//congfigure the entry point and begin to resolve paths 

let config = {
  entry: {
    app: path.resolve('app/app.js')
  },

// Starts dishing out the output
  
  output: {
    path: path.resolve(`${buildPath}/${version}`),
    filename: '[name].js',
    publicPath: `${baseUrl}/${version}/`
  },

//loading Modules
  
  module: {
    loaders: [
      {test: /\.js(x)?$/, loaders: ['react-hot', 'babel'], exclude: /node_modules/},
      {test: /\.json$/, loaders: ['json']}
    ]
  },

//Insert plugins

  plugins: [
    new webpack.NoErrorsPlugin(),
    new webpack.EnvironmentPlugin(Object.keys(env))
  ]
};

export default config;
