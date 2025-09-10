package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pxk implements rww {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pxk(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [hdd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.rww
    public final Object fr() {
        int i = this.c;
        if (i == 0) {
            return new pxj((lat) this.a, this.b);
        }
        if (i == 1) {
            return ((hde) this.b).a(this.a, true, hde.b);
        }
        if (i != 2) {
            if (i != 3) {
                Set set = (Set) ((qzg) this.b).a.d.get(((oca) this.a).h);
                return set != null ? set : sfd.a;
            }
            oca ocaVar = (oca) this.a;
            Set set2 = (Set) ((qzg) this.b).a.a.get(new rwd(ocaVar.h, ocaVar.g));
            return set2 != null ? set2 : sfd.a;
        }
        Object obj = this.a;
        synchronized (this.b) {
            String strB = qpm.b();
            String str = strB + ".trace";
            File file = new File(((Context) obj).getFilesDir(), mn.g(strB, "primes_profiling_"));
            if (!file.exists() && !file.mkdir()) {
                return rvk.a;
            }
            File file2 = new File(file, str);
            file2.deleteOnExit();
            try {
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (RuntimeException unused) {
            }
            return rwc.j(file2);
        }
    }

    public /* synthetic */ pxk(lat latVar, ScheduledExecutorService scheduledExecutorService, int i) {
        this.c = i;
        this.a = latVar;
        this.b = scheduledExecutorService;
    }
}
