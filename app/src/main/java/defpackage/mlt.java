package defpackage;

import android.graphics.PointF;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlt implements mlx {
    private final Supplier a;

    public mlt(Supplier supplier) {
        this.a = supplier;
    }

    private final mlx e() {
        return (mlx) this.a.get();
    }

    @Override // defpackage.mlx
    public final void a() {
        e().a();
    }

    @Override // defpackage.mlx
    public final void b() {
        e().b();
    }

    @Override // defpackage.mlx
    public final mmf c(poj pojVar, PointF pointF) {
        return e().c(pojVar, pointF);
    }

    @Override // defpackage.mlx, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        e().close();
    }

    @Override // defpackage.mlx
    public final mmf d(poj pojVar) {
        return e().d(pojVar);
    }
}
