package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrd implements hqz {
    private final /* synthetic */ int a;

    public hrd(int i) {
        this.a = i;
    }

    @Override // defpackage.hqz
    public final ByteArrayOutputStream a(Bitmap bitmap) {
        if (this.a != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
            return byteArrayOutputStream;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
        try {
            try {
                dataOutputStream.writeInt(bArrArray.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                Bitmap.Config config = bitmap.getConfig();
                config.getClass();
                dataOutputStream.writeUTF(config.toString());
                dataOutputStream.write(bArrArray);
                return byteArrayOutputStream2;
            } catch (IOException e) {
                throw new IOException("Could not write into ByteArrayOutputStream", e);
            }
        } finally {
            dataOutputStream.close();
        }
    }
}
