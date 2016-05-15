package com.kws.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by jihoon on 2016. 5. 15..
 */
public class FileReaderTest4 {


    private FileReader _input;

    @Before
    public void setUp() {
        try {
            _input = new FileReader("/Users/jihoon/workspaceStudy/Refactoring/Refactoring/src/com/kws/testFixture/data.txt");
        } catch(FileNotFoundException e) {
            throw new RuntimeException("파일을 열 수 없습니다");
        }
    }


    @After
    public void tearDown() {
        try {
            _input.close();

        } catch(IOException e) {
            throw new RuntimeException("파일을 닫는 중 에러 발생");
        }
    }

    @Test
    public void read() throws IOException {
        char ch = '&';
//		_input.close();
        for (int i=0; i<4; i++) {
            ch = (char) _input.read();
            System.out.println(ch);
        }
//		assertTrue('d'==ch);
//		assert('m' == ch);
        assertEquals('d', ch);
    }



}
