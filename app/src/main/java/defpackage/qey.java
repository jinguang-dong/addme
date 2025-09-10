package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qey extends Exception {
    public qey(String str) {
        super(str);
    }

    public qey(Exception exc) {
        super("Exception while parsing video", exc);
    }
}
