public class Directions{
	final static int totalNumerOfDirections = 4;
	final static String inventedBy = "Egyptian astronomer ptloemy";
	CardialDirections directions;
	IntermediateDirections directions1;
	
	
	
	public static void main(String[] args)
	{
		Directions direction= new Directions();
		Alphabets alphabets = new Alphabets();
		SolarSystem solarSystem = new SolarSystem();
		Exam exam = new Exam();
		TrafficSignal trafficSignal = new TrafficSignal();
		
		System.out.println("final variabels");
		System.out.println(direction.totalNumerOfDirections);
		System.out.println(direction.inventedBy);
		System.out.println(alphabets.numberOfAlphabets);
		System.out.println(alphabets.numberOfVowels);
		System.out.println(solarSystem.numberOfPlanets);
		System.out.println(solarSystem.redPlanetInSolarSystem);
		System.out.println(exam.fatherOfExam);
		System.out.println(exam.firstExamWasConductedIn);
		System.out.println(trafficSignal.numberOfColors);
		System.out.println(trafficSignal.redMeans);
		System.out.println("--------------------------------------------------");
		System.out.println("enum variables");
		
		direction.directions = CardialDirections.north;
		direction.directions1 = IntermediateDirections.northeast;
        System.out.println(direction.directions);
		System.out.println(direction.directions1);

		alphabets.vowels = VowelsInAlphabets.a;
		alphabets.consonents = ConsonentsInAlphabets.h;
		System.out.println(alphabets.vowels);
		System.out.println(alphabets.consonents);
		
		solarSystem.names = Planets.earth;
		solarSystem.name = TerrestrialPlanets.mars;
		System.out.println(solarSystem.names);
		System.out.println(solarSystem.name);
		
		exam.result = ExamResult.pass;
		exam.exam1 = ModesOfExam.offline;
		System.out.println(exam.result);
		System.out.println(exam.exam1);
		
		trafficSignal.colors = TrafficSignalColors.red;
		trafficSignal.meaning = ColorsMeaning.stop;
		System.out.println(trafficSignal.colors);
		System.out.println(trafficSignal.meaning);	
		
	}
}

class Alphabets{
	final static int numberOfAlphabets = 26;
	final static int numberOfVowels = 5;
	VowelsInAlphabets vowels;
	ConsonentsInAlphabets consonents;	
}


class SolarSystem{
	final static int numberOfPlanets = 8;
	final static String redPlanetInSolarSystem = "mars";
	Planets names;
	TerrestrialPlanets name;	
}


class Exam{
	final static String fatherOfExam = "Henry Fischel";
	final static String firstExamWasConductedIn = "china";
	ExamResult result;
	ModesOfExam exam1;
}


class TrafficSignal{
	final static int numberOfColors =3;
	final static String redMeans = "stop";
	TrafficSignalColors colors;
	ColorsMeaning meaning;
	
}


enum VowelsInAlphabets{
	A,E,I,O,U,a,e,i,o,u;	
}

enum ConsonentsInAlphabets{
	B,C,D,F,G,H,J,K,L,M,N,P,Q,R,S,T,V,W,X,Y,Z,b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z;
}

enum Planets{
	mercury,venus,earth,mars,jupiter,saturn,uranus,neptune;
}

enum TerrestrialPlanets{
	mercury, venus,earth,mars;
}

enum CardialDirections{
	north,south,east,west
}

enum IntermediateDirections{
	northeast,southeast,northwest,southwest;
}

enum ExamResult{
	pass,fail,absent,withheld;
}

enum ModesOfExam {
	offline,online;
}

enum TrafficSignalColors{
	red,yellow,green;
}

enum ColorsMeaning{
	stop,wait,go;
}