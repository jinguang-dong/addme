package defpackage;

import j$.util.Set;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bes extends ufs implements Set, bdv {
    private final bem a;
    private final /* synthetic */ int b;

    public bes(bem bemVar, int i) {
        this.b = i;
        this.a = bemVar;
    }

    @Override // defpackage.ufi
    public final int a() {
        int i = this.b;
        return this.a.b();
    }

    @Override // defpackage.ufi, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (this.b == 0) {
            return this.a.containsKey(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        bem bemVar = this.a;
        Object obj2 = bemVar.get(entry.getKey());
        return obj2 != null ? a.ao(obj2, entry.getValue()) : entry.getValue() == null && bemVar.containsKey(entry.getKey());
    }

    @Override // defpackage.ufs, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = 0;
        if (this.b != 0) {
            bew[] bewVarArr = new bew[8];
            while (i < 8) {
                bewVarArr[i] = new bex();
                i++;
            }
            return new ben(this.a.b, bewVarArr);
        }
        bew[] bewVarArr2 = new bew[8];
        while (i < 8) {
            bewVarArr2[i] = new bey();
            i++;
        }
        return new ben(this.a.b, bewVarArr2);
    }
}
