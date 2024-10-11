package ch13.sample04;

class BinaryTree<T extends Comparable<T>> {
    // 노드 클래스 정의
    private class Node {
        T data;         // 노드 데이터
        Node left;     // 왼쪽 자식 노드
        Node right;    // 오른쪽 자식 노드

        Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node root;  // 트리의 루트 노드

    // 생성자
    public BinaryTree() {
        root = null;
    }

    // 데이터 추가 메서드
    public void add(T data) {
        root = addRecursive(root, data);
    }

    // 재귀적으로 노드 추가
    private Node addRecursive(Node current, T data) {
        if (current == null) {
            return new Node(data);  // 새로운 노드 생성
        }

        if (data.compareTo(current.data) < 0) {
            current.left = addRecursive(current.left, data);  // 왼쪽 서브트리에 추가
        } else if (data.compareTo(current.data) > 0) {
            current.right = addRecursive(current.right, data);  // 오른쪽 서브트리에 추가
        }

        return current;  // 현재 노드를 반환
    }

    // 중위 순회 메서드
    public void inOrder() {
        inOrderTraversal(root);
    }

    // 재귀적으로 중위 순회
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);   // 왼쪽 서브트리 순회
            System.out.print(node.data + " "); // 현재 노드 방문
            inOrderTraversal(node.right);  // 오른쪽 서브트리 순회
        }
    }
}