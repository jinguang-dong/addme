package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uhv extends ufm implements Serializable, List, uhu {
    private final Enum[] a;

    public uhv(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final Object writeReplace() {
        return new uhw(this.a);
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ufi, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        return ((Enum) rnt.an(this.a, r3.ordinal())) == r3;
    }

    @Override // defpackage.ufm, java.util.List
    public final /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.a;
        a.ai(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.ufm, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        Enum[] enumArr = this.a;
        int iOrdinal = r3.ordinal();
        if (((Enum) rnt.an(enumArr, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.ufm, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
