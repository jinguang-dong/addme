package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class bjm {
    public final int a;

    public /* synthetic */ bjm(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return a.p(i, 1) ? "Next" : a.p(i, 2) ? "Previous" : a.p(i, 3) ? "Left" : a.p(i, 4) ? "Right" : a.p(i, 5) ? "Up" : a.p(i, 6) ? "Down" : a.p(i, 7) ? "Enter" : a.p(i, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bjm) && this.a == ((bjm) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
