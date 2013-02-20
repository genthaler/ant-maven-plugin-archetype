#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
File touchFile = new File( basedir, "target/touch.txt" );

assert touchFile.isFile()
