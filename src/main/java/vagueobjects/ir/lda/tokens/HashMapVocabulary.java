package vagueobjects.ir.lda.tokens;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class HashMapVocabulary implements Vocabulary {
    final List<String> strings =new ArrayList<String>();
    final HashMap<String, Integer> map = new HashMap();
    private int termIndex = 0;

    public HashMapVocabulary(Collection<String> strings) {
        for (String s : strings)
            addTerm(s);
    }

    public HashMapVocabulary(String path ) throws IOException {
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNextLine()){
            addTerm(scanner.nextLine().trim());
        }
    }

    private void addTerm(String term) {
        strings.add(term);
        map.put(term, termIndex++);
    }

    @Override
    public boolean contains(String token) {
        return map.containsKey(token);
    }

    @Override
    public int size() {
        return strings.size();
    }

    @Override
    public int getId(String token) {
        return map.get(token);
    }

    @Override
    public String getToken(int id) {
        return strings.get(id);
    }
}
