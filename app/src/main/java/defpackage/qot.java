package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qot {
    public int a = 1;

    public abstract void i(qna qnaVar);

    public abstract void j(qna qnaVar);

    public final void k(qna qnaVar) {
        if (this.a == 3) {
            return;
        }
        this.a = 3;
        i(qnaVar);
    }

    public final void l(qna qnaVar) {
        if (this.a == 2) {
            return;
        }
        this.a = 2;
        j(qnaVar);
    }
}
