package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okn extends oix {
    public static final Parcelable.Creator CREATOR = new okg(3);
    ParcelFileDescriptor a;
    final String b;
    final String c;
    public File d;

    public okn(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    static final void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        if (this.a != null) {
            int iU = ojl.u(parcel);
            ojl.I(parcel, 2, this.a, i);
            ojl.J(parcel, 3, this.b);
            ojl.J(parcel, 4, this.c);
            ojl.w(parcel, iU);
            return;
        }
        File file = this.d;
        if (file == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                this.a = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                fileCreateTempFile.delete();
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                try {
                    try {
                        throw null;
                    } catch (IOException e) {
                        throw new IllegalStateException("Could not write into unlinked file", e);
                    }
                } catch (Throwable th) {
                    a(dataOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                throw new IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Could not create temporary file:", e2);
        }
    }
}
