package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class epm implements Cloneable {
    public final ezh a = fad.a;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final epm clone() {
        try {
            return (epm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof epm)) {
            return false;
        }
        ezh ezhVar = this.a;
        ezh ezhVar2 = ((epm) obj).a;
        char[] cArr = fax.a;
        return a.ao(ezhVar, ezhVar2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
