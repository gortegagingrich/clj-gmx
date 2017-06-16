# clj-gmx

Simple application for generating game maker studio room files from one or more jmap files with defined offsets

## Usage
to run:
    $ java -jar [generated jar].jar [args]

for single jmap file:
	[args] = InputFile xOffset yOffset OutputFile

	ex:
	$ java -jar clj-gmx-0.1.0-standalone.jar kirika/r01.jmap 0 0 r01.room.gmx

for multiple jmap files:
	[args] = ConfigFile OutputFile

	ex:
	$ java -jar clj-gmx-0.1.0-standalone.jar config.txt r01.room.gmx

	config file format:
		InputFile0 xOffset0 yOffset0
		InputFile1 xOffset1 yOffset1
		...
		InputFilen xOffsetn yOffsetn

## Bugs:

Does not gracefully handle ill-formed input files.

## Todo:

Finish improved config format that allows for generating multiple output files.
Get around to making some sort of user friendly GUI.
