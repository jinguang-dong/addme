package defpackage;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bna {
    public final bmt a;
    public final RenderNode b;
    public long c;
    public Matrix d;
    public float e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public long l;
    public long m;
    public float n;
    public float o;
    public int p;
    public final ocq q;
    private Paint r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;

    public bna(ocq ocqVar, bmt bmtVar) {
        this.q = ocqVar;
        this.a = bmtVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.b = renderNode;
        this.c = 0L;
        renderNode.setClipToBounds(false);
        g(renderNode, 0);
        this.e = 1.0f;
        this.f = 3;
        this.g = 1.0f;
        this.h = 1.0f;
        long j = bkv.a;
        this.l = j;
        this.m = j;
        this.o = 8.0f;
        this.p = 0;
    }

    private final void f() {
        boolean z = this.t;
        boolean z2 = z && !this.s;
        boolean z3 = z && this.s;
        if (z2 != this.u) {
            this.u = z2;
            this.b.setClipToBounds(z2);
        }
        if (z3 != this.v) {
            this.v = z3;
            this.b.setClipToOutline(z3);
        }
    }

    private final void g(RenderNode renderNode, int i) {
        if (a.p(i, 1)) {
            renderNode.setUseCompositingLayer(true, this.r);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.p(i, 2)) {
            renderNode.setUseCompositingLayer(false, this.r);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.r);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final Paint a() {
        Paint paint = this.r;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.r = paint2;
        return paint2;
    }

    public final void b() {
        this.b.discardDisplayList();
    }

    public final void c(boolean z) {
        this.t = z;
        f();
    }

    public final void d() {
        int i = this.p;
        if (a.p(i, 1) || !a.p(this.f, 3)) {
            g(this.b, 1);
        } else {
            g(this.b, i);
        }
    }

    public final void e(Outline outline) {
        this.b.setOutline(outline);
        this.s = outline != null;
        f();
    }
}
