package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcn {
    public Executor b;
    public dfd c;
    private final ukx d;
    private final Context e;
    private final String f;
    private Executor h;
    private boolean i;
    private boolean n;
    public final List a = new ArrayList();
    private final List g = new ArrayList();
    private final cxb o = new cxb((char[]) null);
    private final Set j = new LinkedHashSet();
    private final Set k = new LinkedHashSet();
    private final List l = new ArrayList();
    private boolean m = true;

    public dcn(Context context, Class cls, String str) {
        this.d = ske.ax(cls);
        this.e = context;
        this.f = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x03b4, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dco a() {
        /*
            Method dump skipped, instructions count: 961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcn.a():dco");
    }

    public final void b(ddx... ddxVarArr) {
        ddx ddxVar = ddxVarArr[0];
        Integer numValueOf = Integer.valueOf(ddxVar.a);
        Set set = this.k;
        set.add(numValueOf);
        set.add(Integer.valueOf(ddxVar.b));
        ddx[] ddxVarArr2 = (ddx[]) Arrays.copyOf(ddxVarArr, 1);
        ddxVarArr2.getClass();
        for (ddx ddxVar2 : ddxVarArr2) {
            this.o.e(ddxVar2);
        }
    }

    public final void c() {
        this.i = true;
    }

    @ueo
    public final void d() {
        this.m = false;
        this.n = true;
    }
}
