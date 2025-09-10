package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eow extends epm {
    @Override // defpackage.epm
    public final boolean equals(Object obj) {
        if (!(obj instanceof eow) || !(obj instanceof epm)) {
            return false;
        }
        ezh ezhVar = this.a;
        ezh ezhVar2 = ((epm) obj).a;
        char[] cArr = fax.a;
        return a.ao(ezhVar, ezhVar2);
    }
}
