package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ozj implements rvu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ozj(lsw lswVar, Bitmap bitmap, int i, int i2) {
        this.d = i2;
        this.c = lswVar;
        this.b = bitmap;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [sgt, shi] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) throws IOException {
        if (this.d == 0) {
            Object obj2 = this.b;
            List list = (List) obj;
            rwc rwcVar = (rwc) ske.V(((ozk) obj2).f);
            Object obj3 = this.c;
            FileDescriptor fileDescriptor = (FileDescriptor) ske.V(((ozl) obj3).r());
            rnt.L(list.get(0) == rwcVar);
            rnt.L(list.get(1) == fileDescriptor);
            try {
                return new oza(fileDescriptor, this.a, ((ozl) obj3).l, rwcVar, ((ozl) obj3).k, ((ozl) obj3).j, ((ozl) obj3).c != null ? 2 : 3, ((ozl) obj3).d != null ? 1 : 3, true != ((ozl) obj3).o.isEmpty() ? 2 : 3, ((ozl) obj3).n, ((ozl) obj3).i, ((ozk) obj2).g, ((ozk) obj2).c, ((ozl) obj3).r, ((ozl) obj3).w);
            } catch (IllegalArgumentException | oyf e) {
                Log.e("VideoRecorderImpl", "Failed to create muxer processor", e);
                throw new IllegalArgumentException(e);
            }
        }
        Uri uri = (Uri) obj;
        uri.getClass();
        Uri uriBuild = uri.buildUpon().appendPath("thumbnail").build();
        int i = this.a;
        Object obj4 = this.b;
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(rbu.c(((lsw) this.c).d, uriBuild, "w", rbt.a("com.google.android.apps.photos")).getParcelFileDescriptor());
            try {
                jsv.I((Bitmap) obj4, i).compress(Bitmap.CompressFormat.JPEG, 90, autoCloseOutputStream);
                autoCloseOutputStream.close();
                z = true;
            } finally {
            }
        } catch (IOException e2) {
            ((sgt) ((sgt) lsw.a.b().i(e2)).M((char) 4422)).v("Failed to save bitmap to %s", uriBuild);
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ ozj(ozk ozkVar, ozl ozlVar, int i, int i2) {
        this.d = i2;
        this.b = ozkVar;
        this.c = ozlVar;
        this.a = i;
    }
}
