package com.xworkz.task;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.awt.print.PrinterException;
import java.beans.IntrospectionException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.rmi.ServerError;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.RuntimeErrorException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.naming.event.NamingExceptionEvent;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.validation.SchemaFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class Events {

	public void book()
	{
		System.out.println("Running book method");
		throw new RuntimeException();
	}
	public void mobile()
	{
		System.out.println("Running mobile method");
		throw new ArithmeticException();
	}
	public void pen()
	{
		System.out.println("Running pen method");
		throw new ArrayStoreException();
	}
	public void paper()
	{
		System.out.println("Running paper method");
		throw new BufferOverflowException();
	}
	public void event1()
	{
		System.out.println("Running event1 method");
		throw new BufferUnderflowException();
	}
	public void event2()
	{
		System.out.println("Running event2 method");
		throw new CannotRedoException();
	}
	public void event3()
	{
		System.out.println("Running event3 method");
		throw new CannotUndoException();
	}
	public void event4()
	{
		System.out.println("Running event4 method");
		throw new ClassCastException();
	}
	public void event5()
	{
		System.out.println("Running event5 method");
		throw new CMMException(null);
	}
	public void event6()
	{
		System.out.println("Running event6 method");
		throw new ConcurrentModificationException();
	}
	public void event7()
	{
		System.out.println("Running event7 method");
		throw new DOMException((short) 0, null);
	}
	public void event8()
	{
		System.out.println("Running event8 method");
		throw new EmptyStackException();
	}
	public void event9()
	{
		System.out.println("Running event9 method");
		throw new EnumConstantNotPresentException(null, null);
	}
	public void event10()
	{
		System.out.println("Running event10 method");
		throw new EventException((short) 0, null);
	}
	public void event11()
	{
		System.out.println("Running event11 method");
		throw new FileSystemAlreadyExistsException();
	}
	public void event12()
	{
		System.out.println("Running event12 method");
		throw new FileSystemNotFoundException();
	}
	public void event13()
	{
		System.out.println("Running event13 method");
		throw new IllegalArgumentException();
	}
	public void event14()
	{
		System.out.println("Running event14 method");
		throw new IllegalPathStateException();
	}
	public void event15()
	{
		System.out.println("Running event15 method");
		throw new IllegalStateException();
	}
	public void event16()
	{
		System.out.println("Running event16 method");
		throw new ImagingOpException(null);
	}
	public void event17()
	{
		System.out.println("Running event17 method");
		throw new IncompleteAnnotationException(null, null);
	}
	public void event18()
	{
		System.out.println("Running event18 method");
		throw new IndexOutOfBoundsException();
	}
	public void event19()
	{
		System.out.println("Running event19 method");
		throw new JMRuntimeException();
	}
	public void event20()
	{
		System.out.println("Running event20 method");
		throw new LSException((short) 0, null);
	}
	public void event21()
	{
		System.out.println("Running event21 method");
		throw new MalformedParameterizedTypeException();
	}
	public void event22()
	{
		System.out.println("Running event22 method");
		throw new MirroredTypesException(null);
	}
	public void event23()
	{
		System.out.println("Running event23 method");
		throw new MissingResourceException(null, null, null);
	}
	public void event24()
	{
		System.out.println("Running event24 method");
		throw new NegativeArraySizeException();
	}
	public void event25()
	{
		System.out.println("Running event25 method");
		throw new NoSuchElementException();
	}
	public void event26()
	{
		System.out.println("Running event26 method");
		throw new NoSuchMechanismException();
	}
	public void event27()
	{
		System.out.println("Running event27 method");
		throw new NullPointerException();
	}
	public void event28()
	{
		System.out.println("Running event28 method");
		throw new ProfileDataException(null);
	}
	public void event29()
	{
		System.out.println("Running event29 method");
		throw new ProviderException();
	}
	public void event30()
	{
		System.out.println("Running event30 method");
		throw new ProviderNotFoundException();
	}
	public void event31()
	{
		System.out.println("Running event31 method");
		throw new RasterFormatException(null);
	}
	public void event32()
	{
		System.out.println("Running event32 method");
		throw new RejectedExecutionException();
	}
	public void event33()
	{
		System.out.println("Running event33 method");
		throw new SecurityException();
	}
	
	//   Exception (Throws)
	
	public void mass1() throws Exception
	{
		System.out.println("Running mass1 method");
		throw new Exception();
	}
	public void mass2() throws AWTException
	{
		System.out.println("Running mass2 method");
		throw new AWTException(null);
	}
	public void mass3() throws BadAttributeValueExpException
	{
		System.out.println("Running mass3 method");
		throw new BadAttributeValueExpException(getClass());
	}
	public void mass4() throws BadBinaryOpValueExpException
	{
		System.out.println("Running mass4 method");
		throw new BadBinaryOpValueExpException(null);
	}
	public void mass5() throws BadLocationException
	{
		System.out.println("Running mass5 method");
		throw new BadLocationException(null, 0);
	}
	public void mass6() throws BadStringOperationException
	{
		System.out.println("Running mass6 method");
		throw new BadStringOperationException(null);
	}
	public void mass7() throws BrokenBarrierException
	{
		System.out.println("Running mass7 method");
		throw new BrokenBarrierException();
	}
	public void mass8() throws CertificateException
	{
		System.out.println("Running mass8 method");
		throw new CertificateException();
	}
	public void mass9() throws CloneNotSupportedException
	{
		System.out.println("Running mass9 method");
		throw new CloneNotSupportedException();
	}
	public void mass10() throws DataFormatException
	{
		System.out.println("Running mass10 method");
		throw new DataFormatException();
	}
	public void mass11() throws DatatypeConfigurationException
	{
		System.out.println("Running mass11 method");
		throw new DatatypeConfigurationException();
	}
	public void mass12() throws DestroyFailedException
	{
		System.out.println("Running mass12 method");
		throw new DestroyFailedException();
	}
	public void mass13() throws ExpandVetoException
	{
		System.out.println("Running mass13 method");
		throw new ExpandVetoException(null);
	}
	public void mass14() throws FontFormatException
	{
		System.out.println("Running mass14 method");
		throw new FontFormatException(null);
	}
	public void mass15() throws GeneralSecurityException
	{
		System.out.println("Running mass15 method");
		throw new GeneralSecurityException();
	}
	public void mass16() throws GSSException
	{
		System.out.println("Running mass16 method");
		throw new GSSException(0);
	}
	public void mass17() throws IllegalClassFormatException
	{
		System.out.println("Running mass17 method");
		throw new IllegalClassFormatException();
	}
	public void mass18() throws InterruptedException
	{
		System.out.println("Running mass18 method");
		throw new InterruptedException();
	}
	public void mass19() throws IntrospectionException
	{
		System.out.println("Running mass19 method");
		throw new IntrospectionException(null);
	}
	public void mass20() throws InvalidApplicationException
	{
		System.out.println("Running mass20 method");
		throw new InvalidApplicationException(null);
	}
	public void mass21() throws InvalidMidiDataException
	{
		System.out.println("Running mass21 method");
		throw new InvalidMidiDataException();
	}
	public void mass22() throws InvalidTargetObjectTypeException
	{
		System.out.println("Running mass22 method");
		throw new InvalidTargetObjectTypeException(null);
	}
	public void mass23() throws IOException
	{
		System.out.println("Running mass23 method");
		throw new IOException();
	}
	public void mass24() throws JMException
	{
		System.out.println("Running mass24 method");
		throw new JMException();
	}
	public void mass25() throws KeySelectorException
	{
		System.out.println("Running mass25 method");
		throw new KeySelectorException();
	}
	public void mass26() throws LineUnavailableException
	{
		System.out.println("Running mass26 method");
		throw new LineUnavailableException();
	}
	public void mass27() throws MarshalException
	{
		System.out.println("Running mass27 method");
		throw new MarshalException(null);
	}
	public void mass28() throws MidiUnavailableException
	{
		System.out.println("Running mass28 method");
		throw new MidiUnavailableException();
	}
	public void mass29() throws MimeTypeParseException
	{
		System.out.println("Running mass29 method");
		throw new MimeTypeParseException();
	}
	public void mass30() throws NamingException
	{
		System.out.println("Running mass30 method");
		throw new NamingException();
	}
	public void mass31() throws NotBoundException
	{
		System.out.println("Running mass31 method");
		throw new NotBoundException();
	}
	public void mass32() throws ParseException
	{
		System.out.println("Running mass32 method");
		throw new ParseException(null, 0);
	}
	public void mass33() throws ParserConfigurationException
	{
		System.out.println("Running mass33 method");
		throw new ParserConfigurationException();
	}
	public void mass34() throws PrinterException
	{
		System.out.println("Running mass34 method");
		throw new PrinterException();
	}
	public void mass35() throws PrivilegedActionException
	{
		System.out.println("Running mass35 method");
		throw new PrivilegedActionException(null);
	}
	
	// Error
	
	public void boss1()
	{
		System.out.println("Running boss1 method");
		throw new AssertionError();
	}
	public void boss2()
	{
		System.out.println("Running boss2 method");
		throw new AWTError(null);
	}
	public void boss3()
	{
		System.out.println("Running boss1 method");
		throw new CoderMalfunctionError(null);
	}
	public void boss4()
	{
		System.out.println("Running boss4 method");
		throw new FactoryConfigurationError();
	}
	public void boss5()
	{
		System.out.println("Running boss5 method");
		throw new IOError(null);
	}
	public void boss6()
	{
		System.out.println("Running boss6 method");
		throw new LinkageError();
	}
	public void boss7()
	{
		System.out.println("Running boss7 method");
		throw new SchemaFactoryConfigurationError();
	}
	public void boss8()
	{
		System.out.println("Running boss8 method");
		throw new ServiceConfigurationError(null);
	}
	public void boss9()
	{
		System.out.println("Running boss9 method");
		throw new ThreadDeath();
	}
	public void boss10()
	{
		System.out.println("Running boss10 method");
		throw new TransformerFactoryConfigurationError();
	}
	public void boss11()
	{
		System.out.println("Running boss11 method");
		throw new BootstrapMethodError();
	}
	public void boss12()
	{
		System.out.println("Running boss12 method");
		throw new ClassCircularityError();
	}
	public void boss13()
	{
		System.out.println("Running 13 method");
		throw new ClassFormatError();
	}
	public void boss14()
	{
		System.out.println("Running 14 method");
		throw new ExceptionInInitializerError();
	}
	public void boss15()
	{
		System.out.println("Running 15 method");
		throw new IncompatibleClassChangeError();
	}
	public void boss16()
	{
		System.out.println("Running 16 method");
		throw new NoClassDefFoundError();
	}
	public void boss17()
	{
		System.out.println("Running 17 method");
		throw new UnsatisfiedLinkError();
	}
	public void boss18()
	{
		System.out.println("Running 18 method");
		throw new VerifyError();
	}
	public void boss19()
	{
		System.out.println("Running 19 method");
		throw new InternalError();
	}
	public void boss20()
	{
		System.out.println("Running 20 method");
		throw new OutOfMemoryError();
	}
	public void boss21()
	{
		System.out.println("Running 21 method");
		throw new StackOverflowError();
	}
	public void boss22()
	{
		System.out.println("Running 22 method");
		throw new UnknownError();
	}
	
	
	

}


