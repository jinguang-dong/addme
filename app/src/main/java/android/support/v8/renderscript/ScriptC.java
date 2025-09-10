package android.support.v8.renderscript;

import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScriptC extends Script {
    private static final String TAG = "ScriptC";

    public ScriptC(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    private static synchronized long internalCreate(RenderScript renderScript, Resources resources, int i) {
        byte[] bArr;
        int i2;
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            try {
                bArr = new byte[1024];
                i2 = 0;
                while (true) {
                    int length = bArr.length;
                    int i3 = length - i2;
                    if (i3 == 0) {
                        int i4 = length + length;
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                        i3 = i4 - i2;
                        bArr = bArr2;
                    }
                    int i5 = inputStreamOpenRawResource.read(bArr, i2, i3);
                    if (i5 <= 0) {
                    } else {
                        i2 += i5;
                    }
                }
            } finally {
                inputStreamOpenRawResource.close();
            }
        } catch (IOException unused) {
            throw new Resources.NotFoundException();
        }
        return renderScript.nScriptCCreate(resources.getResourceEntryName(i), renderScript.getApplicationContext().getCacheDir().toString(), bArr, i2);
    }

    private static synchronized long internalStringCreate(RenderScript renderScript, String str, byte[] bArr) {
        return renderScript.nScriptCCreate(str, renderScript.getApplicationContext().getCacheDir().toString(), bArr, bArr.length);
    }

    protected ScriptC(RenderScript renderScript, Resources resources, int i) {
        super(0L, renderScript);
        long jInternalCreate = internalCreate(renderScript, resources, i);
        if (jInternalCreate == 0) {
            throw new RSRuntimeException("Loading of ScriptC script failed.");
        }
        setID(jInternalCreate);
    }

    protected ScriptC(RenderScript renderScript, String str, byte[] bArr, byte[] bArr2) {
        long jInternalStringCreate;
        super(0L, renderScript);
        if (RenderScript.sPointerSize == 4) {
            jInternalStringCreate = internalStringCreate(renderScript, str, bArr);
        } else {
            jInternalStringCreate = internalStringCreate(renderScript, str, bArr2);
        }
        if (jInternalStringCreate != 0) {
            setID(jInternalStringCreate);
            return;
        }
        throw new RSRuntimeException("Loading of ScriptC script failed.");
    }
}
