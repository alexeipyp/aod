package sut.ist813.kravec;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        //СПИСОК
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Добавление элементов в список
        for (int i = 1; i <= 10; i++)
            list.add(i);
        list.add(2, 0);
        System.out.print("\nСписок: добавлены элементы " + list);
        //Удаление элементов из списка
        list.remove(0);
        System.out.print("\nСписок: удален первый элемент " + list);
        //Получение элемента по индексу из списка
        System.out.print("\nПолучен первый элемент списка: " + list.get(0));
        //Проверка списка на пустоту
        //list.clear();
        if (list.isEmpty())
            System.out.print("\nСписок пустой.\n");
        else
            System.out.print("\nРазмер списка: " + list.size() + " элементов(а)\n");

        //СТЕК
        Stack<Integer> stack = new Stack<Integer>();
        //Добавление элементов в стек
        for (int i = 1; i <= 10; i++)
            stack.push(i);
        System.out.print("\nСтек: добавлены элементы " + stack);
        //Удаление элементов из стека
        stack.pop();
        System.out.print("\nСтек: удален верхний элемент " + stack);
        //Получение элемента стека
        System.out.print("\nПолучен верхний элемент стека: " + stack.peek());
        //Проверка стека на пустоту
        //stack.clear();
        if (stack.empty())
            System.out.print("\nСтек пустой.\n");
        else
            System.out.print("\nРазмер стека: " + stack.size() + " элементов(а)\n");

        //ОЧЕРЕДЬ
        Queue<Integer> queue = new LinkedList<Integer>();
        //Добавление элементов в очередь
        for (int i = 1; i <= 10; i++)
            queue.offer(i);
        System.out.print("\nОчередь: добавлены элементы " + queue);
        //Удаление элементов из очереди
        queue.poll();
        System.out.print("\nОчередь: удален первый элемент " + queue);
        //Получение элемента очереди
        System.out.print("\nПолучен первый элемент очереди: " + queue.peek());
        //Проверка очереди на пустоту
        //queue.clear();
        if (queue.isEmpty())
            System.out.print("\nОчередь пуста.\n");
        else
            System.out.print("\nРазмер очереди: " + queue.size() + " элементов(а)\n");

        //СЛОВАРЬ
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        //Добавление элементов в словарь
        map.put(10, "List");
        map.put(20, "Stack");
        map.put(30, "Queue");
        map.put(40, "Map");
        System.out.print("\nСловарь: добавлены элементы " + map);
        //Удаление элементов из словаря
        map.remove(40);
        System.out.print("\nСловарь: удален элемент c ключем '40' " + map);
        //Получение элемента по ключу
        System.out.print("\nПолучен  элемент словаря с ключем '20': " + map.get(20));
        //Реализация обхода словаря
        Iterator iter = map.entrySet().iterator();
        String searchFor = "Queue";
        while (iter.hasNext())
        {
            Map.Entry pair = (Map.Entry)iter.next();
            if (pair.getValue() == searchFor)
            {
                System.out.print("\nЗначение '" + searchFor + "' найдено в словаре под ключом " + pair.getKey());
                break;
            }
        }
        //Проверка словаря на пустоту
        //map.clear();
        if (map.isEmpty())
            System.out.print("\nСловарь пуст.\n");
        else
            System.out.print("\nРазмер словаря: " + map.size() + " элементов(а)\n");
    }
}