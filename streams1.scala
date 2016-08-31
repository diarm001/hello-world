// Akka streams, Flowshape which can be in itself
// an inner complex toplogy of streams

Flowshape (Inlet<I> in, Outlet <O> out)

A = Outlet 		// Input from file, API etc.
B = Flowshape	// Ingest and Emit
C = Inlet 		// Sink of Flowshape 

// Computation graph

A ~> B ~> C

// Akka streams 
// chain of processing steps
// sequence of elements

