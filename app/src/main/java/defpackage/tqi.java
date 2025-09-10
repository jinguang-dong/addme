package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tqi implements tqp {
    public static final tqi a = new tqi(1);
    private final /* synthetic */ int b;

    public tqi(int i) {
        this.b = i;
    }

    @Override // defpackage.tqp
    public final tqo a(Class cls) throws ClassNotFoundException {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!tph.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            Class clsAsSubclass = cls.asSubclass(tph.class);
            tph tphVar = (tph) tph.aU.get(clsAsSubclass);
            if (tphVar == null) {
                try {
                    Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    tphVar = (tph) tph.aU.get(clsAsSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (tphVar == null) {
                tphVar = (tph) ((tph) trv.f(clsAsSubclass)).a(6, null);
                if (tphVar == null) {
                    throw new IllegalStateException();
                }
                tph.aU.put(clsAsSubclass, tphVar);
            }
            return (tqo) tphVar.a(3, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    @Override // defpackage.tqp
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return tph.class.isAssignableFrom(cls);
        }
        return false;
    }
}
