package cz.cvut.fel.omo.cv10;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class TradeHistory {

    public List<Transaction> transactions;

    public TradeHistory(List<Transaction> transctions) {
        this.transactions = transctions;
    }

    public List<Transaction> findAllTransactionsIn2011AndSortByValueAsc(){
        List<Transaction> newList = new ArrayList<Transaction>();
        newList = transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
        newList = newList.stream().filter(t -> t.getYear() == 2011).collect(Collectors.toList());
        return newList;
    }

    public List<String> getUniqueCitiesSortedAsc(){
        List<String> newList = new ArrayList<String>();
        for (int i=0; i<transactions.size(); i++) {
            if (!newList.contains(transactions.get(i).getTrader().getCity())) {
                newList.add(transactions.get(i).getTrader().getCity());
            }
        }
        return newList.stream().sorted().collect(Collectors.toList());
    }

    public String getSingleStringFromUniqueTradersNamesSortByNameAsc(){
        String traderStr = "Traders:";
        List<String> newList = new ArrayList<String>();
        for (int i=0; i<transactions.size(); i++) {
            if (!newList.contains(transactions.get(i).getTrader().getName())) {
                newList.add(transactions.get(i).getTrader().getName());
            }
        }
        newList = newList.stream().sorted().collect(Collectors.toList());
        for (int j=0; j< newList.size(); j++) {
            traderStr += " " + newList.get(j);
        }
        return traderStr;
    }

    public boolean isSomeTraderFromCity(String cityName){
        boolean isSome = false;
        List<String> newList = new ArrayList<String>();
        for (int i=0; i<transactions.size(); i++) {
            if (!newList.contains(transactions.get(i).getTrader().getCity())) {
                newList.add(transactions.get(i).getTrader().getCity());
            }
        }
        isSome = newList.stream().anyMatch(str -> str == cityName);
        return isSome;
    }

    public Optional<Transaction> findSmallestTransactionUsingReduce(){
        Optional<Transaction> smallestTransaction = null;
        //Implement body here
        return smallestTransaction;
    }

    public Map<String, List<Trader>> getTradersByTown(){
        Map<String, List<Trader>> tradersByTown = new HashMap<String, List<Trader>>();
        //Implement body here
        return tradersByTown;
    }

    public Map<String, Long> getTradersCountsByTown(){
        Map<String, Long> tradersByTown = new HashMap<String, Long>();
        //Implement body here
        return tradersByTown;
    }

    public Map<Boolean, List<Transaction>> partitionTransactionsByTraderIsVegetarian(){
        Map<Boolean, List<Transaction>> transactionsBy = new HashMap<Boolean, List<Transaction>>();
        return transactionsBy;
    }
}
