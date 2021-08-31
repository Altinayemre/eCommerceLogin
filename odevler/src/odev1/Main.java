package odev1;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"Yazılım Geliştrici Yetiştirme Kampı (C#+ANGULAR)","Engin Demirog","%89 tamamlandı");
		Course course2=new Course(2,"Yazılım Geliştrici Yetiştirme Kampı (JAVA+REACT)","Engin Demirog","%17 tamamlandı");
		Course course3=new Course(3,"Programlamaya Giriş için Temel Kurs","Engin Demirog","%100 tamamlandı");
		
		Category category1=new Category(1,"Programlama");
		
		Category[] categories= {category1};
		
		for(Category category:categories) {
			System.out.println(category.categoryName);
		}
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.courseName+" --> "+course.instructorName+" --> "+course.completionRate);
		}
		
		Course course4 = new Course(4,"Yazılım Geliştrici Yetiştirme Kampı (JAVASCRIPT)","Engin Demirog","Ücretsiz");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course4);
		courseManager.update(course3);

	}

}
