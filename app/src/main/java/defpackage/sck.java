package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sck extends ryj implements Serializable {
    public static final sck a;
    public static final sck b;
    private final transient sbp c;

    static {
        int i = sbp.d;
        a = new sck(sex.a);
        b = new sck(sbp.l(seo.a));
    }

    public sck(sbp sbpVar) {
        this.c = sbpVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.seq
    public final /* bridge */ /* synthetic */ Set a() {
        sbp sbpVar = this.c;
        if (sbpVar.isEmpty()) {
            return sfd.a;
        }
        seo seoVar = seo.a;
        return new sfe(sbpVar, sen.a);
    }

    Object writeReplace() {
        return new scj(this.c);
    }
}
