package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sbr {
    Object[] a;
    int b;
    tdy c;

    public sbr() {
        this(4);
    }

    private final sbv a(boolean z) {
        tdy tdyVar;
        tdy tdyVar2;
        if (z && (tdyVar2 = this.c) != null) {
            throw tdyVar2.a();
        }
        sfc sfcVarG = sfc.g(this.b, this.a, this);
        if (!z || (tdyVar = this.c) == null) {
            return sfcVarG;
        }
        throw tdyVar.a();
    }

    private final void c(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, sbd.a(length, i2));
        }
    }

    public sbv b() {
        return a(true);
    }

    public final sbv e() {
        return a(false);
    }

    public void f(Object obj, Object obj2) {
        c(this.b + 1);
        ujp.bo(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final void g(Map.Entry entry) {
        f(entry.getKey(), entry.getValue());
    }

    public final void h(sbr sbrVar) {
        sbrVar.getClass();
        c(this.b + sbrVar.b);
        Object[] objArr = sbrVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = sbrVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += sbrVar.b;
    }

    public final void i(Iterable iterable) {
        if (iterable instanceof Collection) {
            c(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g((Map.Entry) it.next());
        }
    }

    public final void j(Map map) {
        i(map.entrySet());
    }

    public sbr(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
