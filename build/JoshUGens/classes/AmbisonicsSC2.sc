// June 19, 2001: Added rect method to BFDecode
		yneg = -0.61 * sig.at(2);
		
//		var wout, xout, yout, allout;
//		wout = sig * 0.707;
//		xout = (sig * cos(loc));
//		yout = (sig * sin(loc));
//		xout = (wout + xout) * 0.35 ;
//		yout = (wout + yout) * 0.61;
//		^allout = [xout, yout]
		

	*quad { arg distance=1, clockwise=true;
		^this.n( 4, distance, clockwise )
	}
	*eight { arg distance=1, clockwise=true;
		^this.n( 8, distance, clockwise )
	}
	*n { arg n, distance=1, clockwise=true;
		var pi2;
		pi2 = clockwise.if(-2pi, 2pi);
		^Array.fill( n, { arg i;
			Spkr.newt( Polar( distance, (pi2 * i/n + (pi/n)).wrap(0,2pi) ) )
		})
	}
}