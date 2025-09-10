package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lda implements ldd {
    private final Handler a;
    private final Handler b;
    private final Handler c;
    private final Handler d;

    public lda(Handler handler, Handler handler2, Handler handler3, Handler handler4) {
        this.a = handler;
        this.b = handler2;
        this.c = handler3;
        this.d = handler4;
    }

    @Override // defpackage.ldd
    public final Handler a(lcz lczVar) {
        if (lcz.B.contains(lczVar)) {
            return this.a;
        }
        if (lcz.C.contains(lczVar)) {
            return this.b;
        }
        if (lcz.D.contains(lczVar)) {
            return this.c;
        }
        if (lczVar != lcz.VIEWFINDER) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.ldd
    public final /* synthetic */ rwc b(lcz lczVar) {
        return qpt.bX(this, lczVar);
    }
}
