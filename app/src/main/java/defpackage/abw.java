package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abw {
    public final int a;
    private final abz b;

    public abw(abz abzVar, int i) {
        this.b = abzVar;
        this.a = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        sb.append((Object) (this.a != 1 ? "Finished" : "BoundReached"));
        sb.append(", endState=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
