package defpackage;

import android.view.View;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fsu implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fsu(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, tqr] */
    /* JADX WARN: Type inference failed for: r8v13, types: [fqb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsu.call():java.lang.Object");
    }

    public /* synthetic */ fsu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public fsu(Method method, View view, int i) {
        this.c = i;
        this.b = method;
        this.a = view;
    }
}
