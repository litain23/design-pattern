package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        shelf.addBook(new Book("JAVA DESIGN PATTERN"));
        shelf.addBook(new Book("환율이란"));
        shelf.addBook(new Book("소크라테스의 변명"));
        shelf.addBook(new Book("화폐전쟁"));

        Iterator it = shelf.iterator();
        while(it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println("Book Name : " + book.getName());
        }

        // Iterator를 쓰는 이유...
        // BookShelf 구조적 변경이 발생해도 while문 안에 있는 로직적인 부분은 변경이 필요가 없다
        // 왜냐면 book을 가져오는 역할은  it에게 위임되어있기 때문에,

        // if BookShelf의  book list가 아니라 book map 으로 바뀌었다면
        // Bookshelf의 getLength 나 getBook 같은 메소드는 바뀌어도, iterator의 수정이 필요하지만
        // while 안에 있는 전체적인 로직은 변경되지 않는다.
    }
}
