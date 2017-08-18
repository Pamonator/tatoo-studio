/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabatase;

/**
 *
 * @author Admin
 * @param <E>
 */
public interface IConnection<E> {

    public boolean connect();

    public boolean execute(E eObejc);

    public boolean disconnect();

}
