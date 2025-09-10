package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sgi extends ryn implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient sgg header;
    public final transient sam range;
    public final transient sgh rootReference;

    public sgi(sgh sghVar, sam samVar, sgg sggVar) {
        super(samVar.a);
        this.rootReference = sghVar;
        this.range = samVar;
        this.header = sggVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        Comparator comparator = (Comparator) object;
        sla.i(ryn.class, "comparator").b(this, comparator);
        sla.i(sgi.class, "range").b(this, new sam(comparator, false, null, 1, false, null, 1));
        sla.i(sgi.class, "rootReference").b(this, new sgh());
        sgg sggVar = new sgg();
        sla.i(sgi.class, "header").b(this, sggVar);
        u(sggVar, sggVar);
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            h(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static int t(sgg sggVar) {
        if (sggVar == null) {
            return 0;
        }
        return sggVar.c;
    }

    public static void u(sgg sggVar, sgg sggVar2) {
        sggVar.h = sggVar2;
        sggVar2.g = sggVar;
    }

    public static void v(sgg sggVar, sgg sggVar2, sgg sggVar3) {
        u(sggVar, sggVar2);
        u(sggVar2, sggVar3);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(f().comparator());
        objectOutputStream.writeInt(g().size());
        for (sec secVar : g()) {
            objectOutputStream.writeObject(secVar.b());
            objectOutputStream.writeInt(secVar.a());
        }
    }

    private final long x(int i, sgg sggVar) {
        long jAf;
        long jX;
        if (sggVar == null) {
            return 0L;
        }
        int iCompare = this.comparator.compare(this.range.e, sggVar.a);
        if (iCompare > 0) {
            return x(i, sggVar.f);
        }
        if (iCompare != 0) {
            jAf = ujp.af(i, sggVar.f) + ujp.ae(i, sggVar);
            jX = x(i, sggVar.e);
        } else {
            if (this.range.g - 1 != 0) {
                return ujp.af(i, sggVar.f);
            }
            jAf = ujp.ae(i, sggVar);
            jX = ujp.af(i, sggVar.f);
        }
        return jAf + jX;
    }

    private final long y(int i, sgg sggVar) {
        long jAf;
        long jY;
        if (sggVar == null) {
            return 0L;
        }
        int iCompare = this.comparator.compare(this.range.c, sggVar.a);
        if (iCompare < 0) {
            return y(i, sggVar.e);
        }
        if (iCompare != 0) {
            jAf = ujp.af(i, sggVar.e) + ujp.ae(i, sggVar);
            jY = y(i, sggVar.f);
        } else {
            if (this.range.f - 1 != 0) {
                return ujp.af(i, sggVar.e);
            }
            jAf = ujp.ae(i, sggVar);
            jY = ujp.af(i, sggVar.e);
        }
        return jAf + jY;
    }

    private final long z(int i) {
        sgg sggVar = (sgg) this.rootReference.a;
        long jAf = ujp.af(i, sggVar);
        if (this.range.b) {
            jAf -= y(i, sggVar);
        }
        return this.range.d ? jAf - x(i, sggVar) : jAf;
    }

    @Override // defpackage.ryi
    public final int b() {
        return ske.af(z(2));
    }

    @Override // defpackage.ryi
    public final Iterator c() {
        return new sge(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        sam samVar = this.range;
        if (samVar.b || samVar.d) {
            ujp.aL(new sge(this));
            return;
        }
        sgg sggVarG = this.header.g();
        while (true) {
            sgg sggVar = this.header;
            if (sggVarG == sggVar) {
                u(sggVar, sggVar);
                this.rootReference.a = null;
                return;
            }
            sgg sggVarG2 = sggVarG.g();
            sggVarG.b = 0;
            sggVarG.e = null;
            sggVarG.f = null;
            sggVarG.g = null;
            sggVarG.h = null;
            sggVarG = sggVarG2;
        }
    }

    @Override // defpackage.ryi, defpackage.sed
    public final int d(Object obj, int i) {
        ujp.bq(i, "occurrences");
        Object obj2 = this.rootReference.a;
        int[] iArr = new int[1];
        try {
            if (this.range.b(obj) && obj2 != null) {
                this.rootReference.a(obj2, ((sgg) obj2).f(this.comparator, obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // defpackage.sed
    public final int fw(Object obj) {
        try {
            Object obj2 = this.rootReference.a;
            if (this.range.b(obj) && obj2 != null) {
                return ((sgg) obj2).a(this.comparator, obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // defpackage.ryi, defpackage.sed
    public final void h(Object obj, int i) {
        ujp.bq(i, "occurrences");
        if (i == 0) {
            fw(obj);
            return;
        }
        a.I(this.range.b(obj));
        Object obj2 = this.rootReference.a;
        if (obj2 != null) {
            this.rootReference.a(obj2, ((sgg) obj2).b(this.comparator, obj, i, new int[1]));
        } else {
            this.comparator.compare(obj, obj);
            sgg sggVar = new sgg(obj, i);
            sgg sggVar2 = this.header;
            v(sggVar2, sggVar, sggVar2);
            this.rootReference.a(null, sggVar);
        }
    }

    @Override // defpackage.ryi, defpackage.sed
    public final boolean i(Object obj, int i) {
        ujp.bq(0, "newCount");
        ujp.bq(i, "oldCount");
        a.I(this.range.b(obj));
        Object obj2 = this.rootReference.a;
        if (obj2 == null) {
            return i == 0;
        }
        int[] iArr = new int[1];
        this.rootReference.a(obj2, ((sgg) obj2).h(this.comparator, obj, i, iArr));
        return iArr[0] == i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, defpackage.sed
    public final Iterator iterator() {
        return ujp.at(this);
    }

    @Override // defpackage.ryn
    public final Iterator o() {
        return new sgf(this);
    }

    @Override // defpackage.sfo
    public final sfo r(Object obj, int i) {
        return new sgi(this.rootReference, this.range.a(new sam(this.comparator, false, null, 1, true, obj, i)), this.header);
    }

    @Override // defpackage.sfo
    public final sfo s(Object obj, int i) {
        return new sgi(this.rootReference, this.range.a(new sam(this.comparator, true, obj, i, false, null, 1)), this.header);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.sed
    public final int size() {
        return ske.af(z(1));
    }

    public final void w(Object obj) {
        ujp.bq(0, "count");
        if (!this.range.b(obj)) {
            a.I(true);
            return;
        }
        Object obj2 = this.rootReference.a;
        if (obj2 == null) {
            return;
        }
        sgg sggVar = (sgg) obj2;
        this.rootReference.a(obj2, sggVar.i(this.comparator, obj, new int[1]));
    }

    public sgi(Comparator comparator) {
        super(comparator);
        this.range = new sam(comparator, false, null, 1, false, null, 1);
        sgg sggVar = new sgg();
        this.header = sggVar;
        u(sggVar, sggVar);
        this.rootReference = new sgh();
    }
}
