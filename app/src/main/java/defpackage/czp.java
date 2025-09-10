package defpackage;

import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czp {
    public czl b;
    public boolean c;
    private final FileOutputStream d;
    public int a = 1;
    private boolean e = true;

    public czp(FileOutputStream fileOutputStream) {
        this.d = fileOutputStream;
    }

    public final czq a() {
        coi.w(true, "Mp4AtFileParameters must be set for FILE_FORMAT_MP4_WITH_AUXILIARY_TRACKS_EXTENSION");
        int i = this.a;
        czl czlVar = this.b;
        if (czlVar == null) {
            czlVar = czl.a;
        }
        return new czq(this.d, i, czlVar, this.c, this.e);
    }

    public final void b() {
        this.e = false;
    }
}
