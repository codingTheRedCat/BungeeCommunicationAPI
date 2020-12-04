package me.theredcat.bungeecommunication.api.util;

public class MessageEncoder {

    private static byte[] encodeChannelID(short channel){
        return buildArray((byte) channel, (byte) (channel >> 8));
    }

    private static short decodeChannelID(byte[] encoded){
        return (short) (((short) encoded[1] & 0xff) << 8 | ((short) encoded[0] & 0xff));
    }

    private static byte[] buildArray(byte... bytes){
        return bytes;
    }

    public static byte[] encodeMessage(short channelID, byte[] message){
        byte[] encoded = new byte[2+message.length];

        System.arraycopy(encodeChannelID(channelID), 0, encoded, 0, 2);
        System.arraycopy(message, 0, encoded, 2, message.length);

        return encoded;
    }

    public static short extractChannelID(byte[] encodedMessage){
        byte[] encodedID = new byte[2];

        System.arraycopy(encodedMessage,0,encodedID,0,2);

        return decodeChannelID(encodedID);
    }

    public static byte[] extractMessage(byte[] encodedMessage){
        byte[] message = new byte[encodedMessage.length-2];

        System.arraycopy(encodedMessage,2,message,0,message.length);

        return message;
    }

}
