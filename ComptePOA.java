
/**
* ComptePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from banque.idl
* Thursday, October 3, 2024 7:53:47 PM WET
*/

public abstract class ComptePOA extends org.omg.PortableServer.Servant
 implements CompteOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("lire_montant", new java.lang.Integer (0));
    _methods.put ("crediter", new java.lang.Integer (1));
    _methods.put ("debiter", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Compte/lire_montant
       {
         float $result = (float)0;
         $result = this.lire_montant ();
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 1:  // Compte/crediter
       {
         float somme_credit = in.read_float ();
         this.crediter (somme_credit);
         out = $rh.createReply();
         break;
       }

       case 2:  // Compte/debiter
       {
         float somme_debit = in.read_float ();
         this.debiter (somme_debit);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Compte:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Compte _this() 
  {
    return CompteHelper.narrow(
    super._this_object());
  }

  public Compte _this(org.omg.CORBA.ORB orb) 
  {
    return CompteHelper.narrow(
    super._this_object(orb));
  }


} // class ComptePOA
