package defpackage;

import android.content.Context;
import android.os.storage.StorageManager;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lbs implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lbs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, tzj] */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new IllegalStateException("Could not find longest duration among animators ".concat(String.valueOf(String.valueOf(((ndc) this.a).q)))) : (mlx) this.a.a() : Long.valueOf(lwp.b((Context) this.a)) : Integer.valueOf(((StorageManager) this.a).getInternalStorageRemainingLifetime()) : Boolean.valueOf(((kfg) this.a.a()).f());
    }
}
