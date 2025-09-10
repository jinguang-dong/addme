package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqh implements ppw {
    private final ContentResolver a;
    private final pqe b;
    private Uri c = Uri.EMPTY;
    private final ContentValues d;
    private final ppu e;

    public pqh(pqe pqeVar, ContentResolver contentResolver, ContentValues contentValues, ppu ppuVar) {
        this.b = pqeVar;
        this.a = contentResolver;
        this.d = contentValues;
        this.e = ppuVar;
    }

    @Override // defpackage.ppv
    public final long a() throws IOException {
        if (Uri.EMPTY.equals(this.c)) {
            return -1L;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.openFileDescriptor(this.c, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return -1L;
            }
            try {
                long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                parcelFileDescriptorOpenFileDescriptor.close();
                return statSize;
            } finally {
            }
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // defpackage.ppv
    public final FileInputStream b() throws IOException {
        l();
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.openFileDescriptor(this.c, "r");
            parcelFileDescriptorOpenFileDescriptor.getClass();
            String.format(Locale.ROOT, "Opened ParcelFileDescriptor(fd = %s) for reading for %s", Integer.valueOf(parcelFileDescriptorOpenFileDescriptor.getFd()), this);
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
        } catch (SecurityException e) {
            Log.e("PendingFileObject", "Encountered SecurityException while trying to open input stream: ".concat(String.valueOf(e.getLocalizedMessage())));
            throw new IOException(e);
        }
    }

    @Override // defpackage.ppv
    public final FileOutputStream c() {
        throw null;
    }

    @Override // defpackage.ppv
    public final void d() throws IOException {
        l();
        if (Uri.EMPTY.equals(this.c)) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.openFileDescriptor(this.c, "w");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            Log.w("PendingFileObject", "MediaStore URI created but failed to open fd for " + String.valueOf(this.c));
        }
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            parcelFileDescriptorOpenFileDescriptor.close();
        }
    }

    @Override // defpackage.ppv
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ppv
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ppw
    public final Uri h() {
        return this.c;
    }

    @Override // defpackage.ppw
    public final pqe i() {
        return this.b;
    }

    @Override // defpackage.ppw
    public final void j() {
    }

    @Override // defpackage.ppw
    public final boolean k() {
        return true;
    }

    final void l() throws IOException {
        Uri uri;
        if (Uri.EMPTY.equals(this.c)) {
            String str = this.b.e;
            if (prh.z(str)) {
                uri = this.e.c;
            } else {
                if (!prh.A(str)) {
                    throw new IllegalArgumentException("Trying to insert non-media file: ".concat(this.b.toString()));
                }
                uri = this.e.d;
            }
            try {
                Uri uriInsert = this.a.insert(uri, this.d);
                uriInsert.getClass();
                this.c = uriInsert;
            } catch (SQLiteException e) {
                throw new IOException("Failed to insert media file " + this.b.toString() + ": " + e.getLocalizedMessage(), e);
            }
        }
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // defpackage.ppv
    public final FileOutputStream g() throws IOException {
        l();
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.openFileDescriptor(this.c, "w");
            parcelFileDescriptorOpenFileDescriptor.getClass();
            String.format(Locale.ROOT, IQwwK.wTOM, Integer.valueOf(parcelFileDescriptorOpenFileDescriptor.getFd()), this);
            return new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorOpenFileDescriptor);
        } catch (SecurityException e) {
            Log.e("PendingFileObject", "Encountered SecurityException while trying to open output stream: ".concat(String.valueOf(e.getLocalizedMessage())));
            throw new IOException(e);
        }
    }
}
