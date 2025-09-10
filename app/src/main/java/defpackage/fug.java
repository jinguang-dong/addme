package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fug {
    AUTO,
    MAX;

    public static int a(fug fugVar) {
        return fugVar.ordinal() != 1 ? 0 : 1;
    }
}
