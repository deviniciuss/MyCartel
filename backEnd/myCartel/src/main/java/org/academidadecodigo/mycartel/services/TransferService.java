package org.academidadecodigo.mycartel.services;

public interface TransferService {

    /**
     * Performs a transfer between two {@link Account}
     *
     * @param transfer the transfer object
     * @throws AccountNotFoundException
     * @throws TransactionInvalidException
     */
    void transfer(Transfer transfer)
            throws AccountNotFoundException, TransactionInvalidException;

    /**
     * Performs a transfer between two {@link Account}, if possible
     *
     * @param transfer   the transfer object
     * @param customerId the customer id
     * @throws CustomerNotFoundException
     * @throws AccountNotFoundException
     * @throws TransactionInvalidException
     */
    void transfer(Transfer transfer, Integer customerId)
            throws CustomerNotFoundException, AccountNotFoundException, TransactionInvalidException;
}
