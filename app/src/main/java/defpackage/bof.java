package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bof {
    public final boolean h;
    public final boolean i;

    public /* synthetic */ bof(boolean z, boolean z2, int i) {
        this.h = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.i = ((i & 2) == 0) & z2;
    }
}
