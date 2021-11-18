// Log4j 2 사용법
package com.eomcs.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// - 프로그램을 실행 과정을 실행하는 중에 콘솔이나 파일에 기록하고 싶을 때 사용하는 라이브러리다.
// - 단계별로 출력을 제어할 수 있다.
// - 프로그램 실행 과정을 추적하거나 디버깅할 때 유용하다.

// 사용법
// 1) log4j 라이브러리 파일을 프로젝트에 포함한다. 
//    search.maven.org 사이트에서 log4j로 검색한다.
//    라이브러리 정보를 build.gradle에 포함시킨다.
// 2) 
public class Exam01 {

  // 기록을 남길 때 사용할 도구 준비
  // - 클래스 당 한 개의 도구만 있어도 된다.

  private static final Logger logger = LogManager…