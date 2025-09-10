package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcf {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, rww] */
    public final qxf a() {
        this.f.getClass();
        if (this.a == null) {
            this.a = qxf.b;
        }
        if (this.e == null) {
            Object obj = this.f;
            Context context = qxf.a;
            this.e = rnt.y(new fvq(obj, 17));
        }
        if (this.d == null) {
            this.d = new fvq(this, 20);
        }
        int i = 1;
        if (this.c == null) {
            Object obj2 = this.f;
            Context context2 = qxf.a;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, new rcj(new qqe((Context) obj2)), new rcq());
            this.c = rnt.y(new fvq(arrayList, 18));
        }
        if (this.b == null) {
            this.b = new qxi(this, i);
        }
        return new qxf((Context) this.f, this.a, this.e, this.d, this.c, this.b);
    }
}
