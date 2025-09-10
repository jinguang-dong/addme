package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdy {
    public Object a;
    public Object b;

    public sdy(byte[] bArr) {
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final IllegalArgumentException a(boolean z) {
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(this.a);
        for (Object obj : this.b) {
            sb.append(", ");
            sb.append(obj);
        }
        if (z) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final void b(Object obj) {
        obj.getClass();
        if (this.a == null) {
            this.a = obj;
            return;
        }
        if (this.b.isEmpty()) {
            ArrayList arrayList = new ArrayList(4);
            this.b = arrayList;
            arrayList.add(obj);
        } else {
            if (this.b.size() >= 4) {
                throw a(true);
            }
            this.b.add(obj);
        }
    }

    public final void c(List list) {
        OutputStream outputStream = (OutputStream) ujp.aQ(list);
        if (outputStream instanceof rcy) {
            this.b = (rcy) outputStream;
            this.a = (OutputStream) list.get(0);
        }
    }

    public final void d() throws IOException {
        if (this.b == null) {
            throw new rcw("Cannot sync underlying stream");
        }
        ((OutputStream) this.a).flush();
        ((rcy) this.b).a.getFD().sync();
    }

    public final pjs e() {
        Object obj = this.b;
        if (obj == null) {
            throw new IllegalStateException();
        }
        return new pjs((String) obj, (Throwable) this.a);
    }

    public final void f(String str) {
        str.getClass();
        this.b = str;
    }

    public final mhr g() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 == null || (obj = this.b) == null) {
            throw new IllegalStateException();
        }
        return new mhr((mhp) obj2, (mhp) obj);
    }

    public final void h(mhp mhpVar) {
        mhpVar.getClass();
        this.a = mhpVar;
    }

    public final void i(mhp mhpVar) {
        mhpVar.getClass();
        this.b = mhpVar;
    }

    public sdy() {
        this.a = null;
        this.b = Collections.EMPTY_LIST;
    }
}
