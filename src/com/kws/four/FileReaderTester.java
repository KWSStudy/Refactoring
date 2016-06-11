package com.kws.four;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by jihoon on 2016. 5. 15..
 */
public class FileReaderTester extends TestCase {

    private FileReader _input;
    private FileReader _empty;

    public FileReaderTester(String name) {
        super(name);
    }

    protected void setUp() {
        try {
            _input = new FileReader("/Users/jihoon/workspaceStudy/Refactoring/Refactoring/src/com/kws/testFixture/data.txt");
            _empty = newEmptyFile();
        } catch(FileNotFoundException e) {
            throw new RuntimeException("테스트 파일을 열 수 없음");
        } catch(IOException ioe) {
            throw new RuntimeException(ioe.toString());
        }
    }

    private FileReader newEmptyFile() throws IOException {
        File empty = new File("/Users/jihoon/workspaceStudy/Refactoring/Refactoring/src/com/kws/testFixture/empty.txt");
        FileOutputStream out = new FileOutputStream(empty);
        out.close();
        return new FileReader(empty);
    }

    protected void tearDown() {
        try {
            _input.close();

        } catch(IOException e) {
            throw new RuntimeException("테스트파일을 닫는 중 에러 발생");
        }
    }

    public void testRead() throws IOException {
        char ch = '&';
//		_input.close();
        for (int i=0; i<4; i++) {
            ch = (char) _input.read();
            System.out.println("!!!!!!"+ ch);
        }
//		assertTrue('d'==ch);
//		assert('2' == ch);
        assertEquals('d', ch);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new FileReaderTester("testRead"));//메서드 name 을 넘기면 실행
        suite.addTest(new FileReaderTester("testReadAtEnd"));//메서드 name 을 넘기면 실행
        suite.addTest(new FileReaderTester("testReadBoundaries"));//메서드 name 을 넘기면 실행
        suite.addTest(new FileReaderTester("testEmptyRead"));//메서드 name 을 넘기면 실행
        suite.addTest(new FileReaderTester("testReadAfterClose"));//메서드 name 을 넘기면 실행
        return suite;
    }

    public void testReadAtEnd() throws IOException {
        int ch = -1234;
        for (int i=0; i<141; i++) {
            ch = _input.read();
        }

        assertEquals("read at end", -1, ch);
    }

    public void testReadBoundaries() throws IOException {
        assertEquals("read first char", 'B', (char) _input.read());
        int ch = 0;
        for (int i=0; i<140; i++) {
            ch = _input.read();

        }
        System.out.println(ch);
//        assertEquals("read last char", '6', ch);
		assertEquals("read at end", -1, _input.read());
//		assertEquals("read at end", -1, _input.read());
    }

    public void testEmptyRead() throws IOException {
        assertEquals(-1, _empty.read());
    }

    public void testReadAfterClose() throws IOException {
        _input.close();
        try {
            _input.read();
            fail("no exception for read past end");

        } catch(IOException e) { }
    }


}