package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ejr {
    JSON(".json"),
    ZIP(".zip");

    public final String c;

    ejr(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
