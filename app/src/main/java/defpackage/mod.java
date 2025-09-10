package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mod implements moc {
    public final ThumbnailView a;
    public final List b;
    public Long c;
    public final AtomicInteger d;
    public final AtomicInteger e;
    private final tzj f;
    private final iob g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final boolean k;
    private final mof l;
    private final out m;
    private final Executor n;
    private final owq o;
    private Bitmap p;
    private int q;
    private syu r;
    private final luj s;
    private final hbj t;
    private final cxb u;
    private final rnu v;

    public mod(ThumbnailView thumbnailView, boolean z, cxb cxbVar, mof mofVar, owq owqVar, tzj tzjVar, iob iobVar, hbj hbjVar, out outVar, Executor executor, luj lujVar, mwq mwqVar) {
        rnu rnuVar = new rnu(this);
        this.v = rnuVar;
        this.b = new ArrayList();
        this.h = false;
        this.d = new AtomicInteger(0);
        this.e = new AtomicInteger(0);
        this.a = thumbnailView;
        this.f = tzjVar;
        thumbnailView.b = rwc.j(rnuVar);
        thumbnailView.r = mwqVar;
        this.k = z;
        this.u = cxbVar;
        this.l = mofVar;
        this.t = hbjVar;
        this.g = iobVar;
        this.m = outVar;
        this.i = z;
        this.n = executor;
        this.s = lujVar;
        this.o = owqVar;
    }

    @Override // defpackage.moc
    public final synchronized Bitmap a() {
        Bitmap bitmap;
        if (this.q != 0 && (bitmap = this.p) != null) {
            if (this.t.p(gzo.bE)) {
                this.p = this.g.a(bitmap, this.q);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(this.q);
                this.p = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            }
            this.q = 0;
            return this.p;
        }
        return this.p;
    }

    @Override // defpackage.moc
    public final paq b(mob mobVar) {
        this.b.add(mobVar);
        m();
        return new ktu(this, mobVar, 12, (byte[]) null);
    }

    @Override // defpackage.moc
    public final syu c() throws Resources.NotFoundException {
        syu syuVar = this.r;
        if (syuVar != null) {
            return syuVar;
        }
        if (this.k) {
            h();
            syu syuVarM = ske.M(true);
            this.r = syuVarM;
            return syuVarM;
        }
        if (fdo.p(this.u)) {
            syu syuVarM2 = ske.M(true);
            this.r = syuVarM2;
            return syuVarM2;
        }
        mof mofVar = this.l;
        syu syuVarQ = ske.Q(new kbs(mofVar, 4), mofVar.c);
        syu syuVarI = swz.i(syuVarQ, new kou(this, 10), syuVarQ.isDone() ? sxo.a : this.m);
        this.r = syuVarI;
        return syuVarI;
    }

    @Override // defpackage.moc
    public final Long d() {
        return this.c;
    }

    @Override // defpackage.moc
    public final void e(boolean z) {
        this.o.a(true);
        if (!this.i) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((mob) it.next()).b();
            }
        } else if (z) {
            lqc lqcVar = (lqc) this.f.a();
            Intent intent = new Intent(lqcVar.a, (Class<?>) lqcVar.c);
            intent.putExtra("open_filmstrip", true);
            if (((Boolean) lqcVar.e.b(luf.aN)).booleanValue()) {
                intent.putExtra("open_mars", true);
            }
            lqcVar.b(intent, false);
        }
    }

    @Override // defpackage.moc
    public final void f(boolean z) {
        this.m.c(new emz(this, z, 13, (char[]) null));
    }

    @Override // defpackage.moc
    public final void g(boolean z) {
        this.h = z;
    }

    @Override // defpackage.moc
    public final void h() throws Resources.NotFoundException {
        l(((Boolean) this.s.b(luf.aN)).booleanValue() ? 4 : true != this.k ? 2 : 3);
        this.i = this.k;
    }

    @Override // defpackage.moc
    public final void i(String str) {
        if (this.h) {
            return;
        }
        ThumbnailView thumbnailView = this.a;
        if (thumbnailView.getVisibility() != 0) {
            return;
        }
        out.a();
        thumbnailView.p = new fwb(thumbnailView.getMeasuredWidth(), str);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((mob) it.next()).a();
        }
    }

    @Override // defpackage.moc
    public final void j(Supplier supplier) {
        this.d.incrementAndGet();
        ojl.ck(ske.Q(new fsu(this, supplier, 6, null), this.n), new miz(this, 2), this.m);
    }

    @Override // defpackage.moc
    public final void k(Bitmap bitmap, int i) {
        ThumbnailView thumbnailView = this.a;
        thumbnailView.setEnabled(true);
        thumbnailView.c(bitmap, 1, i, ((Boolean) this.s.b(luf.aN)).booleanValue());
        synchronized (this) {
            this.p = bitmap;
            this.q = i;
        }
        this.i = false;
        this.j = true;
        this.o.a(false);
    }

    @Override // defpackage.moc
    public final void l(int i) throws Resources.NotFoundException {
        ThumbnailView thumbnailView = this.a;
        thumbnailView.c(thumbnailView.b(i), i, 0, ((Boolean) this.s.b(luf.aN)).booleanValue());
        synchronized (this) {
            this.p = null;
            this.q = 0;
        }
        if (i != 3 || this.j) {
            this.l.a();
        }
    }

    public final void m() {
        Iterator it = this.b.iterator();
        boolean zD = false;
        while (it.hasNext()) {
            zD |= ((mob) it.next()).d();
        }
        this.a.setLongClickable(zD);
    }
}
