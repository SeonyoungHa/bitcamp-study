package com.eomcs.util;

import java.util.Arrays;
import com.eomcs.pms.handler.AbstractList;

// 일반클래스에 제네릭을 적용하면,
// 최종적인 타입 이름은 
// 해당 클래스의 인스턴스를 생성할 때 전달한다.
public class ArrayList<E> extends AbstractList<E> {

  static final int MAX_LENGTH = 5;

  Object[] list = new Object[MAX_LENGTH];

  @Override
  public void add(E obj) {
    if (size == list.length) {
      Object[] arr = new Object[list.length + (list.length >> 1)];
      for (int i = 0; i < size; i++) {
        arr[i] = list[i];
      }
      list = arr;
    }
    this.list[this.size++] = obj;
  }

  @Override
  public Object[] toArray() {
    Object[] arr = new Object[this.size]; // 배열에 저장된 값을 담을 정도의 크기를 가진 새 배열을 만든다.
    for (int i = 0; i < this.size; i++) { // 배열에 저장된 값을 새 배열에 복사한다.
      arr[i] = list[i];
    }
    return arr; // 새 배열을 리턴한다.
  }

  public boolean remove(E obj) {
    int index = indexOf(obj);
    if (index == -1) {
      return false;
    }

    for (int i = index + 1; i < this.size; i++) {
      this.list[i - 1] = this.list[i];
    }
    this.list[--this.size] = null;

    return true;
  }

  private int indexOf(E obj) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i] == obj) {
        return i;
      }
    }
    return -1;
  }

  @SuppressWarnings("unchecked")
  @Override
  public E get(int index) {
    if (index < 0 || index >= this.size) { // 유효하지 않은 인덱스인 경우
      return null;
    }
    return (E) this.list[index];
  }

  @Override
  public E remove(int index) {

    if (index < 0 || index >= this.size) { // 인덱스가 무효하다면
      return null;
    }

    @SuppressWarnings("unchecked")
    E deleted = (E) this.list[index]; // 삭제할 항목 저장

    for (int i = index + 1; i < this.size; i++) {
      this.list[i - 1] = this.list[i];
    }
    this.list[--this.size] = null;

    return deleted; // 삭제한 항목 리턴
  }

  @Override
  public <T> T[] toArray(T[] arr) {
    // 다음과 같이 제네릭을 적용한 배열 인스턴스는 생성할 수 없다.
    //    T [] temp = new Object[this.size]; // 컴파일 오류!

    // 해결책?
    // => 배열을 만들어 주는 클래스의 도움을 받아야 한다.

    // 1) 파라미터로 받은 배열이 현재 목록에 있는 값을 담을 만큼 충분히 크다면,
    if (arr.length >= this.size) {
      // 현재 목록에 있는 값을 파라미터로 받은 배열에 복사한다.
      // => System.arraycopy(원래배열, 복사시작인덱스, 값을받을배열, 복사시작인덱스, 복사할개수)
      System.arraycopy(this.list, 0, arr, 0, this.size);
    }
    T[] temp = Arrays.copyOf(arr, MAX_LENGTH, null);
  }
}








