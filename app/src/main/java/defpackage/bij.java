package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bij implements buo {
    private und a;
    private boolean b;
    private boolean c;
    public int n;
    public bij p;
    public bij q;
    public bwn r;
    public bwi s;
    public boolean t;
    public boolean u;
    public uif v;
    public boolean w;
    public bij m = this;
    public int o = -1;

    @Override // defpackage.buo
    public final bij B() {
        return this.m;
    }

    public final und C() {
        und undVar = this.a;
        if (undVar != null) {
            return undVar;
        }
        und undVarJ = ung.j(((bxv) bko.D(this)).g.plus(new uon((uol) ((bxv) bko.D(this)).g.get(uol.c))));
        this.a = undVarJ;
        return undVarJ;
    }

    public void D() {
        if (this.w) {
            bqs.c("node attached multiple times");
        }
        if (this.s == null) {
            bqs.c("attach invoked on a node without a coordinator");
        }
        this.w = true;
        this.b = true;
    }

    public void E() {
        if (!this.w) {
            bqs.c("Cannot detach a node that is not attached");
        }
        if (this.b) {
            bqs.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.c) {
            bqs.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.w = false;
        und undVar = this.a;
        if (undVar != null) {
            ung.k(undVar, new bil());
            this.a = null;
        }
    }

    public void F() {
        if (!this.w) {
            bqs.c("reset() called on an unattached node");
        }
        da();
    }

    public void G() {
        if (!this.w) {
            bqs.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.b) {
            bqs.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.b = false;
        cW();
        this.c = true;
    }

    public void H() {
        if (!this.w) {
            bqs.c("node detached multiple times");
        }
        if (this.s == null) {
            bqs.c("detach invoked on a node without a coordinator");
        }
        if (!this.c) {
            bqs.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.c = false;
        uif uifVar = this.v;
        if (uifVar != null) {
            uifVar.a();
        }
        cZ();
    }

    public void I(bij bijVar) {
        this.m = bijVar;
    }

    public final void J(uif uifVar) {
        bko.D(this).m(uifVar);
    }

    public void K(bwi bwiVar) {
        this.s = bwiVar;
    }

    public boolean db() {
        return true;
    }

    public /* synthetic */ void cO() {
    }

    public void cW() {
    }

    public /* synthetic */ void cY() {
    }

    public void cZ() {
    }

    public void da() {
    }
}
