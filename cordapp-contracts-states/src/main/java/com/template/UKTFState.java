package com.template;

import com.google.common.collect.ImmutableList;
import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;

import java.util.Collections;
import java.util.List;

/**
 * Define your state object here.
 */
public class UKTFState implements ContractState {
    //private List<AbstractParty> participants;

    private final int value;
    private final Party exporter;
    private final Party bank;
    //private final Party ukef;

    public UKTFState(int value, Party exporter, Party bank) {
        this.value = value;
        this.exporter = exporter;
        this.bank = bank;
    }

    public int getValue() {
        return value;
    }

    public Party getExporter() {
        return exporter;
    }

    public Party getBank() {
        return bank;
    }

    /** The public keys of the involved parties. */
    @Override public List<AbstractParty> getParticipants() {

        return ImmutableList.of(exporter, bank);
    }
}