class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sortedWords = []

        for word in strs:
            sort = ''.join(sorted(word))
            sortedWords.append(sort)

        map = {}

        for iter,ele in enumerate(sortedWords):
            map.setdefault(ele,[]).append(iter)

        anagramGrp = []

        for idx in map.values():
            anagramGrp.append([strs[i] for i in idx])
            
        return anagramGrp
