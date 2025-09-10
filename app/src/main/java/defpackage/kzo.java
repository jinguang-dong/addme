package defpackage;

import android.util.Pair;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzo implements owf {
    private static final sgv c = sgv.g("kzo");
    public final AtomicReference a = new AtomicReference("");
    public final List b = new CopyOnWriteArrayList();

    /* JADX WARN: Type inference failed for: r4v2, types: [sgt, shi] */
    public static final void e(Pair pair, String str) {
        pau pauVar = (pau) pair.first;
        try {
            ((Executor) pair.second).execute(new img(pauVar, str, 18));
        } catch (RejectedExecutionException e) {
            ((sgt) ((sgt) c.c().i(e)).M((char) 3864)).s("Error executing callback.");
        }
    }

    @Override // defpackage.owf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized String dL() {
        return (String) this.a.get();
    }

    public final synchronized void d() {
        this.a.set("");
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        String str;
        Pair pairCreate = Pair.create(pauVar, executor);
        synchronized (this) {
            str = (String) this.a.get();
        }
        this.b.add(pairCreate);
        e(pairCreate, str);
        return new ktu(this, pairCreate, 3, (byte[]) null);
    }
}
